using System;

public class CharacterCreator
{
    private CharacterBuilder characterBuilder;

    public CharacterCreator(CharacterBuilder builder)
    {
        characterBuilder = builder;
    }

    public Character CreateCharacter()
    {
        return characterBuilder.Character;
    }
}
